package mapper.wrappers

interface InstructionResolver<T> {

    fun resolve(instruction: InstructionWrapper): T

    interface Class : InstructionResolver<ClassWrapper> {
        override fun resolve(instruction: InstructionWrapper): ClassWrapper {
            return instruction.jar[instruction.classId]
        }
    }

    interface Field : InstructionResolver<FieldWrapper> {
        override fun resolve(instruction: InstructionWrapper): FieldWrapper {
            return instruction.jar[instruction.fieldId]
        }
    }

    interface Method : InstructionResolver<MethodWrapper> {
        override fun resolve(instruction: InstructionWrapper): MethodWrapper {
            return instruction.jar[instruction.methodId]
        }
    }
}