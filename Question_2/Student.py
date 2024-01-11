class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age

    def display(self):
        print(f"Name: {self.name}\tGrade: {self.grade}\tAge: {self.age}")