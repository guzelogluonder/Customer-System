# Customer System

The aim of the program is Customer creating and searching.

## Getting Started

To build such system, spring boot framework v2.3.1 used.

Prerequisites
To run the program, a maven is needed. Intellij has all premise installation requirements

## Logic

1. Create the Customer with the name and id code.
2. Serach the Customer with the id code.

# Sample Calls

##### Request

http://localhost:8080/customers

##### Response
{
"id": 1,
"name": "Onder Guzeloglu"
}
##### Request
http://localhost:8080/customers
##### Response
{   
"id":2,
"name":"Soner Guzeloglu"
}
##### Request
http://localhost:8080/cusotmers/1
##### Response
{
"id": 1,
"name": "Onder Guzeloglu"

##### Request
http://localhost:8080/customers/2
##### Response
{
"id":2,
"name":"Soner Guzeloglu"
}

## Built With

Maven - Dependency Management

## Versioning
v0.1

## Authors

Önder Guzeloglu - Initial work"# Customer-System" 
"# Customer-System" 
"# Customer-System" 
