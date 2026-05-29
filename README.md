1.	Project Title
Hospital Management System Using Object-Oriented Programming in Java
2.	Introduction
The Hospital Management System is a software application designed to efficiently manage and streamline the operations of a hospital.In modern healthcare environments,handling patient records,doctor information, prescriptions, billing, and reports manually can lead to inefficiencies, data inconsistency, and increased chances of human error.
To address these challenges, this project presents a computerized Hospital Management System developed using the Java programming language. The system aims to automate key hospital processes, ensuring better organization, faster data retrieval, and improved accuracy. The system is designed based on the principles of Object-Oriented Programming (OOP), namely Encapsulation, Inheritance, Abstraction, and Polymorphism. These principles enhance code modularity, reusability, scalability, and maintainability, making the system more structured and closer to real-world applications.
3.	Objectives
•	To design a simple and efficient hospital management system.
•	To store and manage patient data securely.
•	To demonstrate Java OOP concepts in a real-world application.
•	To generate prescriptions and medical reports.
•	To implement a billing system.
•	To improve efficiency and reduce human errors.
4.	System Design
•	Person
•	PatientData
•	Doctor
•	Receptionist
•	Cashier
•	Prescription
•	MedicalReport
•	Bill
•	Main(HospitalSystem)
 
6.	Discussion
The proposed Hospital Management System is a console based application developed in Java that simulates essential hospital operations. The system is designed using multiple interrelated classes, each representing real-world entities such as patients, doctors, receptionists, cashiers, prescriptions, and medical reports.
The system effectively demonstrates the four fundamental concepts of Object-Oriented Programming:
•	Encapsulation is implemented in the PatientData class, where sensitive patient information such as name, NIC, sickness, and phone number are declared as private variables. Access to these data members is controlled through public methods, ensuring data security and protection.
•	Abstraction is achieved through the abstract class Person, which defines a common structure for all human roles in the system. The abstract method showInfo() is implemented by subclasses, hiding unnecessary implementation details from the user.
•	Inheritance is utilized by creating subclasses such as Doctor, Receptionist, and Cashier, which inherit properties from the Person class. This promotes code reuse and reduces redundancy while maintaining a hierarchical relationship among classes.
•	Polymorphism is demonstrated through method overloading in the MedicalReport class, where the same method name generateReport() performs different functions based on the number and type of parameters passed. This enhances flexibility in method usage.
The system allows users to perform various operations, including adding patient details, viewing all stored patient records, generating prescriptions, creating medical reports, and managing billing through a cashier module. A menu-driven interface is used to facilitate user interaction, and an ArrayList is employed to store patient data dynamically during runtime.

Overall, this project provides a clear and practical implementation of Object-Oriented Programming concepts in a real-world scenario. It not only demonstrates proper software design principles but also serves as a foundation for developing more advanced hospital management systems with additional features such as database integration and graphical user interfaces.
