from Student import Student

class School(Student):
    def SchoolStudentDisplay(self):
        self.display()


student1 = Student("Krishna", "A", 21)


student1.display()


school1 = School("Kishore", "C", 21)


school1.SchoolStudentDisplay()