# quizmodule
A Quiz Game 

I have used h2 database and Spring boot for making this project.I have also add .sql which will load the user , questtion ,options and answers. We can also load 
this data using api call.

 For adding user I making post POST api call "http://localhost:8888/api/user/"

    {
      "name":"Saurabh lal",
      "email":"saurabh@gmail.com",
      "active":true,
      "role":"ADMIN"
    }

#For adding options I am making api call

    {
      "value":"don't know",
      "choice":"A"    
    }

#For adding question I making api call "http://localhost:8888/api/question/"
In Body I am passing

    {
      "description":"What is the result when we divide 2 by 0",
    
      "options":[
          {
              "id":1
          },
          {

             "id": 2
          }
      ],
      "answer": "B"
    }
For adding answers to the question I am making an PUT api call "http://localhost:8888/api/question/1/answers"

    [
      {
        "id": 2
      }
    ]

For adding name of the quiz, number of questions, Start date and End date, Questions to quiz I am calling an post api  "http://localhost:8888/api/quiz/" 
   
    {
        "name":"Math Quiz",
        "startDate":"2021-01-15",
        "endDate":"2021-02-12",
        "numOfQuestion":3,
        "questions":
        
          [
              {
                  "id": 1 
              },
              {
                  "id": 2  
              },
              {
                  "id": 3   
              }
          ]
    }

#After posting the quiz , we can see the quiz by calling GET api "http://localhost:8888/api/quiz/1/" to see the quiz

#Now its time for game We are making an api POST api "http://localhost:8888/api/game/"

    {
  
      "quiz":
      {
          "id":1
      },
      "startedAt": "2021-01-12",
      "endedAt": "2021-01-26",
      "player":{
          "id": 1
      },
      "status": "INSTANTIATED"
    }


#Now to see the Game I am calling a GET api call "http://localhost:8888/api/game/1/"

#Now I am posting response one by one for the question using  POST api call "http://localhost:8888/api/response/"

      {
    
        "game": 
        {
            "id":1
        },
        
        "answers": 
        [
            {"id": 7}
        ],
        
        "question": 
        {
            "id": 2
        }
    }
    












