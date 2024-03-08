<h1 align="center" id="title">Conversa - A Chatroom API</h1>

## Table of Contents
1. [Project Description](#project-description)
2. [Installation instructions](#installation-instructions)
3. [Usage](#usage)
4. [Contributing Instructions](#contributing-instructions)
5. [Credits and Acknowledgements](credits-and-acknowledgements)
6. [Licences](#licences)


## Project Description

This back-end project utilised Java, Spring Boot and a PostgreSQL database to build a chatroom application programming interface (API) that allows users to make requests to a back-end database.


The motivation behind this project was to deepen our understanding of developing back-end APIs using the Spring Framework in conjunction with PostgreSQL databases.



![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)




**The names and versions of any libraries used:**
- Spring Boot: Ver. 3.2.3
- Spring Boot Dev Tools
- Spring Web
- PostgreSQL Driver
- Spring Data JPA




### MVP
- Create a database called chatroom_db.
- Create Models and DTOs for User, Chatroom, and Message.
- Create a DataLoader which populates our table with sample data to use for testing purposes.
- Create Repositories for User, Chatroom, and Message.
- Create Controllers and Services to cover the Create, Read, Update and Delete (CRUD) routes for User, Chatroom, and Message.

### Extensions
- Create derived queries to enable functionality to filter by chatroom_id and filter by user_id ✅
- Add functionality for a user to add a profile picture ✅
- Add functionality for a user to post images to a chatroom ✅
- Add an AI chatbot to a chatroom and add functionality to enable it to respond to messages from a user ✅
- Import external AI APIs to allow for an increased scope of responses for the AI chatbot.
- Create public/private chatrooms using Booleans.
- Add functionality for a user to post voice notes in a chatroom.


### Entity relationship diagrams
![Screenshot 2024-03-05 at 12 40 25](https://github.com/sahilpatel1906/Conversa_API/assets/156658708/5edc7e0a-f2b7-4ad4-b7c7-7fe3eae8032c)



### Class diagrams
<img width="953" alt="Screenshot 2024-03-05 at 12 48 26" src="https://github.com/sahilpatel1906/Conversa_API/assets/156658708/9c30b07a-2576-43a8-a84d-7c23a0604c11">

<img width="953" alt="Screenshot 2024-03-07 at 14 40 30" src="https://github.com/sahilpatel1906/Conversa_API/assets/156658708/b55fa78b-f81e-421d-9355-823c9519919e">



### The URL of the GitHub repository that contains the code:

https://github.com/sahilpatel1906/Conversa_API/


## Installation instructions
- Install Postman, Postico, PostgreSQL and your preferred IDE.
- In terminal or Gitbash, navigate to the directory you want to copy the repository into. \
Run the command ```git clone git@github.com:sahilpatel1906/Conversa_API.git```
- Run the command **git pull** to ensure you have the latest version.
- Open the project in the preferred IDE such as IntelliJ.
- In the terminal or Gitbash, create the database called chatroom_db by running the command ```createdb chatroom_db```.
- Run the ConversaApiApplication file.


## Usage



**List of routes for the Conversa API**                    
- Users:
  - GET:                 
    - getAllUsersAndFilters: “localhost:8080/users?chatroomId={id}”
      - If presented with chatroomId parameter, the sample output is users filtered by chatroomId as shown in sample output 1. Otherwise,  this route will return all users, as shown in sample output 2.
      - Sample Output 1:
        ```javascript
        [
          {
              "id": 2,
              "username": "Yesica",
              "email": "yesica@gmail.com"
          },
          {
              "id": 4,
              "username": "Jean",
              "email": "jean@hotmail.com"
          }
        ]
      - Sample Output 2:
        ```javascript
        [
          {
              "id": 1,
              "username": "Askalotl_AI",
              "email": "askalotl@conversa.com"
          },
          {
              "id": 2,
              "username": "Yesica",
              "email": "yesica@gmail.com"
          },
          {
              "id": 3,
              "username": "Marvellous",
              "email": "marvellous@outlook.com"
          },
          {
              "id": 4,
              "username": "Jean",
              "email": "jean@hotmail.com"
          },
          {
              "id": 5,
              "username": "Aebel",
              "email": "aebel@conversa.com"
          },
          {
              "id": 6,
              "username": "Sahil",
              "email": "sahil@yaoo.com"
          }
        ]
      
    - getUserById: “localhost:8080/users/{id}”
      - This route gets each user by Id.
      - Sample Output:
        ```javascript
        {
            "id": 1,
            "username": "Yesica",
            "email": "yesica@gmail.com"
        }
    
    - getUserProfilePicture: "localhost:8080/users/{id}/profilePicture"
      - This route retrieves the URL for the profile picture associated with the user Id.
      - Sample Output:
        ```javascript
        ./images1.png


  - POST:
    - addNewUser: “localhost:8080/users” -> Request Body:
      - This route adds a new user to the database.
      - Sample Payload:
        ```javascript
        {
          "username": "Gorilla",
          "email": "Gorilla@Gorilla.com"
        }
      - Sample Output:
        ```javascript
        {
          "id": 6,
          "username": "Gorilla",
          "email": "Gorilla@Gorilla.com"
        }
  - PUT:
    - updateUserById: "localhost:8080/users/{id}" -> Request Body:
      - This route updates an existing user in the database based on the Id.
      - Sample Payload:
        ```javascript
        {
          "username": "Not Yessica",
          "email": "notyessica@test.com"
        }
      - Sample Output:
        ```javascript
        {
          "id": 1,
          "username": "Not Yessica",
          "email": "notyessica@test.com"
        }
  - PATCH:
    - getUserProfilePicture: "localhost:8080/users/{id}/profilePicture"
      - This route uploads an image and saves the URL to the user in the database based on their Id.
      - Sample Payload:
          <img width="841" alt="Screenshot 2024-03-06 at 18 35 25" src="https://github.com/sahilpatel1906/Conversa_API/assets/156692751/47ebe57f-cd4b-4099-aaf8-7f36a65bae5c">
      - Sample Output:
        ```javascript
        {
          "id": 1,
          "username": "Yesica",
          "email": "yesica@gmail.com"
        }
  - DELETE:
    - deleteUser: "localhost:8080/users/{id}"
      - This route deletes a user from the database based on their Id.
      - Sample Output:
        ```javascript
        {
          "id": 1,
          "username": "Yesica",
          "email": "yesica@gmail.com"
        }         
Messages: 
- GET:
  - getAllMessages: “localhost:8080/messages/admin”
    - Sample Output:
        ```javascript
        [    
          {
              "id": 1,
              "message": "Eat Kale, stay fit, die anyway",
              "user": {
                  "id": 1,
                  "username": "Yesica",
                  "email": "yesica@gmail.com"
              },
              "chatroom": {
                  "id": 2,
                  "name": "Gecko"
              }
          },
          {
              "id": 2,
              "message": "Believe in yourself. Someone has to.",
              "user": {
                  "id": 1,
                  "username": "Yesica",
                  "email": "yesica@gmail.com"
              },
              "chatroom": {
                  "id": 1,
                  "name": "Axolotl"
              }
          }
        ]
  - getMessagesById: “localhost:8080/messages/{id}"
    - Sample Output:
      ```javascript
      {
        "id": 3,
        "message": "If, at first, you don’t succeed, destroy the evidence that you tried.",
        "user": {
            "id": 3,
            "username": "Jean",
            "email": "jean@hotmail.com"
        },
        "chatroom": {
            "id": 2,
            "name": "Gecko"
        }
      }

- POST
  - addNewMessage: “localhost:8080/messages” -> Request Body:
    - Sample Payload: 
        ```javascript
      {
          "userId" : 2,
          "message" : "Earth is this galaxy's insane asylum. Welcome to my ward.",
          "chatroomId" : 3
      }
    - Sample Output:
      ```javascript
      {
        "id": 8,
        "message": "Earth is this galaxy's insane asylum. Welcome to my ward.",
        "user": {
            "id": 2,
            "username": "Marvellous",
            "email": "marvellous@outlook.com"
        },
        "chatroom": {
            "id": 3,
            "name": "Aploparaksis Turdi"
        }
      }
- PATCH
  - updateMessage: "localhost:8080/messages/{id}" -> Request Body:
    - Sample Payload:
      ```javascript
      message edited
    - Sample Output:
      ```javascript
      {
        "id": 3,
        "message": "message edited",
        "user": {
            "id": 3,
            "username": "Jean",
            "email": "jean@hotmail.com"
        },
        "chatroom": {
            "id": 2,
            "name": "Gecko"
        }
      }        
- DELETE
  - deleteMessage: “localhost:8080/messages/{id}”
    - Sample Output:
      ```javascript
      {
        "id": 3,
        "message": "If, at first, you don’t succeed, destroy the evidence that you tried.",
        "user": {
            "id": 3,
            "username": "Jean",
            "email": "jean@hotmail.com"
        },
        "chatroom": {
            "id": 2,
            "name": "Gecko"
        }
      }

Chatrooms: 
- GET:
  - getAllChatrooms: “localhost:8080/chatrooms/admin”
    - Sample Output:
      ```javascript
      [
        {
            "id": 1,
            "name": "Axolotl"
        },
        {
            "id": 2,
            "name": "Gecko"
        }
      ]
  - getChatroomsById:  “localhost:8080/chatrooms/{id}”
    - Sample Output:
      ```javascript
      {
        "id": 1,
        "name": "Axolotl"
      }
  - filterByUserId: "localhost:8080/chatrooms?userId={id}"
    - Sample Output:
      ```javascript
      [
        {
            "id": 1,
            "name": "Axolotl"
        },
        {
            "id": 2,
            "name": "Gecko"
        }
      ]
- POST:
  - addNewchatroom: “localhost:8080/chatrooms/” -> Request Body:
    - Sample Payload:
      ```javascript
      {
         "name": "gecko"
      }
    - Sample Output:
      ```javascript
      {
        "id": 4,
        "name": "gecko"
      }
- PUT:
  - updateChatroomById: "localhost:8080/chatrooms/{id}" -> Request Body:
    - Sample Payload:
      ```javascript
      {
        "name": "new_name"
      }
    - Sample Output:
      ```javascript
      {
        "id": 2,
        "name": "new_name"
      }
- DELETE:
  - deleteChatroomsById: “localhost:8080/chatrooms/{id}”
    - Sample Output:
      ```javascript
      {
        "id": 1,
        "name": "Axolotl"
      }






### Images displaying the chatroom_db database tables in Postico



<img width="487" alt="Screenshot 2024-03-05 at 14 22 42" src="https://github.com/sahilpatel1906/Conversa_API/assets/156658708/35f58eb8-4b63-43c9-9adb-de81763b139a">

**^ The first image displays the database table overview ^** 



<img width="473" alt="Screenshot 2024-03-05 at 14 23 02" src="https://github.com/sahilpatel1906/Conversa_API/assets/156658708/8b4f5713-7cf6-4751-a436-3f3eb16b6c80">

**^ This image displays the chatrooms table ^**



<img width="725" alt="Screenshot 2024-03-05 at 14 23 14" src="https://github.com/sahilpatel1906/Conversa_API/assets/156658708/adbae0c3-86e7-4574-ba6a-919258563b98">

**^ This image displays the messages table ^**



<img width="447" alt="Screenshot 2024-03-05 at 14 23 25" src="https://github.com/sahilpatel1906/Conversa_API/assets/156658708/0798532c-139d-4dc9-a92c-01480b2a3fe5">

**^ This image displays the users table ^**




## Contributing Instructions

We appreciate your interest in contributing to the Conversa API Project. We welcome contributions of all kinds, from bug reports and documentation improvements to new features and code changes.

Find below our contributing guidelines. By following these guidelines, you'll help us to maintain a high quality codebase and make the review process smoother for everyone.

**1. Fork the Repository:** Create a fork of the Conversa_API repository on GitHub.

**2. Create a Branch:** Clone the forked repository to your local machine & create a new branch for your contribution.

**3.Make Changes:** Make your changes to the code & ensure your changes follow our coding style.

**4. Commit Your Changes:** Commit your changes to your local branch with a descriptive commit message.

**5. Push Your Changes:** Push your changes to your forked repository on GitHub.
     
**6. Create a Pull Request:** Open a pull request from your branch to the main branch of the upstream repository.

**7. Review and Feedback:** We will review your pull request and provide feedback.




## Credits and Acknowledgements

### The Axolotl Intelligence Collaborators:
- Sahil Patel 🙅‍♂️ - GitHub: https://github.com/sahilpatel1906
- Marvellous Akib 🙆‍♂️ - Github: https://github.com/Marv3llous
- Yesica Nithiyanantha 💁‍♀️ - Github: https://github.com/ney601
- Aebel Shajan 🤦 - Github: https://github.com/Aebel-Shajan
- Jean Marwizi 🤷‍♀️	- Github: https://github.com/Jean-005

### Special thanks to:

- Anna Henderson
- Colin Farquhar
- Richard Sneyd
- Thibyaa Mahasivam
- Zsolt Podoba-Szalai

**For their invaluable guidance and assistance with this project.**


## Licences

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)











