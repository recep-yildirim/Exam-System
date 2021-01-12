/**
 * @author Recep YILDIRIM
 */

package data;

import java.util.HashMap;
import java.util.Map;

public class Question {
    private int questionID = 0;
    private String description = null;
    private HashMap<Character, String> options = null;
    private char trueAnswer = ' ';

    public Question(int questionID, String description, HashMap<Character, String> options, char trueAnswer) {
        this.description = description;
        this.options = options;
        this.trueAnswer = trueAnswer;
        this.questionID = questionID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOptions(HashMap<Character, String> options) {
        this.options = options;
    }

    public void setTrueAnswer(char trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public int getQuestionID() {
        return this.questionID;
    }

    public String getDescription() {
        return this.description;
    }

    public HashMap<Character, String> getOptions() {
        return this.options;
    }

    public char getTrueAnswer() {
        return this.trueAnswer;
    }

    public void setOptionByName(char option, String content) {
        if (this.options.containsKey(option)) {
            this.options.replace(option, content);
        } else {
            System.out.println("There is no option with that name.!");
        }
    }

    public String getOptionByName(char option) {
        return this.options.get(option);
    }

    @Override
    public String toString() {
        String options = "";

        for (Map.Entry<Character, String> entry: this.options.entrySet()) {
            options += entry.getKey() + " -> " + entry.getValue() + "\n";
        }

        return "QuestionID: " + this.questionID + "\n" +
               "Description: " + this.description + "\n" +
               "Options:\n" + options +
               "TrueAnswer: " + Character.toString(this.trueAnswer) + "\n";
    }
}