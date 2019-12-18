package finalPackage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random; 
/**
 * Polymorphism 
 *
 * @authors Aadil Umar and Jasper Hoong
 * @version 1.0
 * @created    December 10, 2019
 */


public class PolymorphismQuiz extends Question {
        public PolymorphismQuiz()
        {
        	super.setupQuestion  ();
        }
        public static String mainTest ()
        {
	    	Question q = new PolymorphismQuiz();
	        q.askQuestionConsole();
	        return q.getCounterMsg();
        }

        protected void setupQuestionData() {
			Random rand = new Random();
			  int test = rand.nextInt(4); 
			  // format question
			  if (test == 0) {
			  this.question = "What is polymorphism?";
			  this.choiceA = "A type of variable";
			  this.choiceB = "A method of reusing code";
			  this.choiceC = "A type of class"; 
			  this.choiceD = "Making a variable which can contain different types of data";
			  this.choiceE = "The use of multiple classes";
			  answer = this.choiceB; 
			  }
			  else if (test ==1) {
			  	this.question = "What is the syntax for polymorphism";
			  this.choiceA = "Extends";
			  this.choiceB = "Implements";
			  this.choiceC = "Connects"; 
			  this.choiceD = "Inherits";
			  this.choiceE = "Contains";
			      answer = this.choiceD; 
			  }
			  else if (test ==2) {
			  	this.question = "What does super refer to";
			  this.choiceA = "The subclass";
			  this.choiceB = "The parent class";
			  this.choiceC = "Another class"; 
			  this.choiceD = "A method in the parent class";
			  this.choiceE = "A method in the subclass";
			      answer = this.choiceA; 
			  }
			  else if (test ==3) {
			  	this.question = "How do you inherit multiple classes";
			  this.choiceA = "Inherits";
			  this.choiceB = "Implements";
			  this.choiceC = "Multiple inheritcance isn't possible in Java"; 
			  this.choiceD = "Connects";
			  this.choiceE = "Contains";
			      answer = this.choiceD;
			      
			  }
    		
        }
//    public void setupQuestionData(String QuestionName, double questionNum)
//    {  
//    	Random rand = new Random();
//        int test = rand.nextInt(4); 
//        // format question
//        if (test == 0) {
//        this.question = "What is polymorphism?";
//                    
//        this.choiceA = "A type of variable";
//        this.choiceB = "A method of reusing code";
//        this.choiceC = "A type of class"; 
//        this.choiceD = "Making a variable which can contain different types of data";
//        this.choiceE = "The use of multiple classes";
//        answer = this.choiceB; 
//        }
//        else if (test ==1) {
//        	this.question = "What is the syntax for polymorphism";
//            this.choiceA = "Extends";
//            this.choiceB = "Implements";
//            this.choiceC = "Connects"; 
//            this.choiceD = "Inherits";
//            this.choiceE = "Contains";
//            answer = this.choiceD; 
//        }
//        else if (test ==2) {
//        	this.question = "What does super refer to";
//            this.choiceA = "The subclass";
//            this.choiceB = "The parent class";
//            this.choiceC = "Another class"; 
//            this.choiceD = "A method in the parent class";
//            this.choiceE = "A method in the subclass";
//            answer = this.choiceA; 
//        }
//        else if (test ==3) {
//        	this.question = "How do you inherit multiple classes";
//            this.choiceA = "Inherits";
//            this.choiceB = "Implements";
//            this.choiceC = "Multiple inheritcance isn't possible in Java"; 
//            this.choiceD = "Connects";
//            this.choiceE = "Contains";
//            answer = this.choiceD;
//            
//        }
//    }
}
