package utility;

import identifiers.AbstractIdentifier;

import java.util.*;

public class IdentifierSorter {

    public static List<Class<? extends AbstractIdentifier>> sort(List<Class<? extends AbstractIdentifier>> identifiers) {
        Map<Class<? extends AbstractIdentifier>, List<Class<? extends AbstractIdentifier>>> dependencies = new HashMap<>();
        Map<Class<? extends AbstractIdentifier>, Integer> indegrees = new HashMap<>();

        // Initialize the dependencies and indegrees maps
        for (Class<? extends AbstractIdentifier> identifier : identifiers) {
            DependsOn dependsOn = identifier.getAnnotation(DependsOn.class);
            if (dependsOn != null) {
                for (Class<? extends AbstractIdentifier> dependency : dependsOn.value()) {
                    List<Class<? extends AbstractIdentifier>> dependentIdentifiers = dependencies.getOrDefault(dependency, new ArrayList<>());
                    dependentIdentifiers.add(identifier);
                    dependencies.put(dependency, dependentIdentifiers);
                }
                indegrees.put(identifier, dependsOn.value().length);
            } else {
                indegrees.put(identifier, 0);
            }
        }

        // Perform topological sorting
        List<Class<? extends AbstractIdentifier>> sortedIdentifiers = new ArrayList<>();
        Queue<Class<? extends AbstractIdentifier>> queue = new LinkedList<>();

        for (Map.Entry<Class<? extends AbstractIdentifier>, Integer> entry : indegrees.entrySet()) {
            if (entry.getValue() == 0) {
                queue.offer(entry.getKey());
            }
        }

        while (!queue.isEmpty()) {
            Class<? extends AbstractIdentifier> identifier = queue.poll();
            sortedIdentifiers.add(identifier);

            List<Class<? extends AbstractIdentifier>> dependentIdentifiers = dependencies.getOrDefault(identifier, Collections.emptyList());
            for (Class<? extends AbstractIdentifier> dependentIdentifier : dependentIdentifiers) {
                int indegree = indegrees.get(dependentIdentifier) - 1;
                indegrees.put(dependentIdentifier, indegree);
                if (indegree == 0) {
                    queue.offer(dependentIdentifier);
                }
            }
        }

        if (sortedIdentifiers.size() != identifiers.size()) {
            throw new IllegalArgumentException("Cyclic dependency detected");
        }

        return sortedIdentifiers;
    }

}