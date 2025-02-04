class Employee:
    def __init__(
            self,
            designation: str = 'Developer',
            frontend: bool = False,
            backend: bool = False
    ):
        self.designation = designation
        self.frontend = frontend
        self.backend = backend

    def __repr__(self):
        return '{}'.format(self.designation)

    def verifier(self):
        if self.frontend and self.backend:
            return "Fullstack"
        elif self.frontend:
            return "Frontend Developer"
        elif self.backend:
            return "Backend Developer"
        else:
            return "Not a Developer"

if __name__ == '__main__':
    firstEmployee = Employee()
    print(firstEmployee.verifier())  # Output: Not a Developer

    secondEmployee = Employee(frontend=True)
    print(secondEmployee.verifier())  # Output: Frontend Developer

    thirdEmployee = Employee(backend=True)
    print(thirdEmployee.verifier())  # Output: Backend Developer

    fourthEmployee = Employee(frontend=True, backend=True)
    print(fourthEmployee.verifier())  # Output: Fullstack
