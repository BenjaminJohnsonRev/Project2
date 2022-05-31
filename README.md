# Project2
## Megabites Sandwich Shop

***
### An Explanation and Overview of the project:

We are building a sandwich restaurant website that allows customers to place their orders online.
Examples of things users should be able to do:
* [X]Customers can create an account (register)
* [X]Customers can login
* [X]Customer can customize a sandwich
* [X]Managers can ban customers
see BackEnd\groupReferences\userStories.txt for full list of user interactions

***
### List of features implemented:

* [X]Customers can create an account (register)
* [X]Customers can login
* [X]Customers can add menu items to cart*
* [X]Customer can customize a sandwich:
* [X]Type of bread
* [X]Type of meat
* [X]Type of vegetable
* [X]Type of seasonings(salt/pepper)
* [X]Type of sauces
* [X]Customer can change quantity of ingredients
* [X]Customer can change quantity of sandwiches*
* [X]Customers can view their order in a cart*
* [X]Customers can view current total in cart*
* [X]Customers can view purchase history in account*
* [X]Customers can view receipt after purchase*
* [X]Customers can submit complaints*
* [X]Customers can edit complaints*
* [X]Managers can ban customers
* [X]Managers can see complaints*
* [X]Managers can delete complaints*
* [X]Managers can hire employees*
* [X]Managers can view all orders:*
* [X]By customer*
* [X]By date*
* [X]By employee*
* *not accessible on website (only through Postman currently)

***
### Technologies used:

Back-End built using Spring Boot.
Front-End built with Angular.
Database hosted using AWS RDS.
HTML and CSS within Angular.
Lombok and JPA within Spring.
Mockito for testing HTTP requests.

***
### How to set up / get started using it:

1. Open project from BackEnd folder. If you attempt to start MegabitesApplication from Project2 folder, it may not compile.
2. Double check your applications.properties to ensure you have proper connection settings.
3. Run MegabitesApplication. It will start the Spring server and create all relevant tables.
4. If using local database, use BackEnd\setupDocs to help populate tables.
5. If using local database, check format for sending Postman request JSON by using Get requests. See controllers for more info.
6. Open project from FrontEnd folder. Do not close BackEnd.
7. Open terminal and ensure command line filepath ends in Valentina\megabites-app.
(You may need to use "cd Valentina\megabites-app" to get to the correct folder in command line.)
8. Enter "npm install".
9. Once installed, enter "ng serve --open".
10. If successful, website should open in browser.
11. Welcome to Megabites Sandwich Shop.

***
### Usage of the project:

This project is to be used as a learning tool and is not intended for commercial usage.

***
### Contributors: 

Haruya Maeda, Benjamin Johnson, Valentina Genty, Nicholas Olshansky, Clyde Christian, Daniel Heck

***
### License information:

MIT License

Copyright (c) 2022 Haruya Maeda, Benjamin Johnson, Valentina Genty, Nicholas Olshansky, Clyde Christian, Daniel Heck

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
