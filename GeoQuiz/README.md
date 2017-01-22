Project GeoQuiz

Following the instructions written in Android Programming: The Big Nerd Ranch Guide by Brian Hardy and Bill Phillips, I implemented
a simple and instructional android application named GeoQuiz. The goal of the project was to experiment with the tools provided under 
the Android Studio framework provided by Google, and to gain experience with the application development tools.

The application follows the design of having three interoperating parts under
the MVC philosophy, namely the model objects operated by the controller given instructions from the user interface through the view.
Thus, in this project, the model objects are the quiz questions, the controller is located in `quizActivity.java` that will listen to when
interactions from the view, and the view is defined by the xml file under `activity_main.xml` with a text view for the question from 
the available question bank, and two buttons that the user can interact with and get a corresponding response of Correct and Incorrect from
the application. Afterwards, the controller will increment the question index to the next question and give the user a new question to respond to.

Possible improvements for GeoQuiz
Extend the controller to instead of choosing questions from a manually generated question bank, use an online bank of trivia questions
Implement SQL querying for said test bank
Implement multiple choice questioning
Improve app UX
