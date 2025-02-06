Author: Brandon Shea

Date: Feb 1st - Feb 6th

S4 QAP1


This codebase follows many clean code practices, I'll reference three specific examples below.(screenshots will be added in a separate folder, labeled example 1, 2 and 3.)
        
1) - Encapsulation and Data Integrity:
        - The Game class follows encapsulation by using Private Fields with Public getters and setters.
        - Prevents direct modification of properties.


2) - List rather than Array for flexibility:
    
     - Arrays have fixed sizes, while lists are dynamic.
     - Avoids the need to manually resize or track indices.


3) - Separation of Concerns:

     - Game class only handles game data, the Store class manages the list of games and the Main class only controls UI.
     - Each class has a clear, singular responsibility.



This project is a basic Game Store System. It is able to view available games ( preloaded with 3 of my favorites), and add a new game to the list.
The program currently isn't feature complete (Purchase a game) as I don't believe that was important for the completion of this assignment.


I received help from Jordan for the testing, in a 1 on 1 session as I still struggle with it. 
We put a few test together, notably a test to ensure adding a game functions, a test to change a game after the fact, and a 
test to ensure the game is added to the list after it is input by a user.


Dependencies:
- JUnit 5 (JUnit Jupiter) for Unit Testing: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.11.3
  - This dependency was used to ensure that core functions (adding games, updating details, and retrieving data) work as expected.




Generally speaking I didn't find the project too difficult. I was able to get the main app completed in a day or so, with some occasional help from OpenAI as I'm still no pro.
Notably, OpenAI refactored my store after I completed it to make it more aesthetically pleasing.

Jordan was a huge help in getting the testing setup, as well as the GitHub Actions, as I missed some of those classes due to personal events.




