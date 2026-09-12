# UskBank

**A university-focused banking system for the Üsküdar University community.**

## The Idea

Üsküdar University already partners with a local bank so students can pay their annual tuition. But tuition payment is just one small piece of a student's financial life and for many students, especially international ones, that's where the support ends. Opening and managing a traditional bank account in Turkey can be difficult for international students, who often face extra requirements and barriers that don't exist for locals. As a result, many end up relying on separate digital banking apps just to handle everyday money completely disconnected from anything the university offers.

UskBank starts from that gap: what if a student's everyday banking and their university-related payments lived in the same place?

The goal isn't just to replace a tuition payment portal it's to give the university community a real financial home: depositing and withdrawing money, transferring funds, tracking spending, and managing recurring payments or subscriptions, alongside university-specific payments, all in one system.

While the original idea centered on students, the same needs apply across the university teachers and staff manage money too. UskBank is designed to serve the whole community, with services adapted to each group's needs.

## Features (Vision)

- Send and receive money instantly within the university network
- Deposit and withdraw funds
- Pay university fees directly through the platform
- Track transaction history
- Set up and cancel recurring payments / subscriptions
- Role-based experience for students, teachers, employees, and admins
- Web and mobile banking interfaces
- Simulated campus "ATM" experience (software-based, as part of the web/mobile app)

## Tech Stack

- **Backend:** Java, Spring Boot, Spring Security
- **Database:** MySQL
- **Frontend:** React
- **Version Control:** Git + GitHub

## Project Status

🚧 **In active development built as a learn-by-building project.**

This project is being rebuilt from the ground up as a way to relearn core software engineering fundamentals properly: OOP, databases, REST APIs, authentication, and frontend development, all applied to one real system rather than isolated exercises.

**Currently implemented:**
- [x] Core `Account` class with encapsulated balance, deposit/withdraw logic, and exception-based validation

**Coming next:**
- [ ] Customer and account-holder roles (Student / Teacher / Employee)
- [ ] MySQL schema design
- [ ] REST API with Spring Boot
- [ ] Authentication & role-based access
- [ ] React frontend

## Setup

_Instructions coming once the backend API is in place._