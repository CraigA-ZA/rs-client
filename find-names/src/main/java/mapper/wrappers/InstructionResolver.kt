package mapper.wrappers

interface InstructionResolver<T> {

    fun resolve(instruction: InstructionMapper): T

    interface Class : InstructionResolver<ClassWrapper> {
        override fun resolve(instruction: InstructionMapper): ClassWrapper {
            return instruction.jar[instruction.classId]
        }
    }

    interface Field : InstructionResolver<FieldWrapper> {
        override fun resolve(instruction: InstructionMapper): FieldWrapper {
            return instruction.jar[instruction.fieldId]
        }
    }

    interface Method : InstructionResolver<MethodWrapper> {
        override fun resolve(instruction: InstructionMapper): MethodWrapper {
            return instruction.jar[instruction.methodId]
        }
    }
}