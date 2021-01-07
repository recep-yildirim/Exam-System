package operations;

import data.Database;
import data.Question;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;

public class QuestionOperations {
    private Database database = null;

    public QuestionOperations(Database database) {
        this.database = database;
    }

    public void addQuestion(Question question) {
        try {
            String sql = "INSERT INTO questions VALUES(" +
                    question.getQuestionID() + "," +
                    "'" + question.getDescription() + "'" + "," +
                    "'" + question.getOptionByName('a') + "'" + "," +
                    "'" + question.getOptionByName('b') + "'" + "," +
                    "'" + question.getOptionByName('c') + "'" + "," +
                    "'" + question.getOptionByName('d') + "'" + "," +
                    "'" + question.getOptionByName('e') + "'" + "," +
                    "'" + question.getTrueAnswer() + "'" + "," +
                    "'" + question.getExam() + "'" + "," +
                    "'" + question.getLesson() + "'" + ")";

            this.database.statement.executeUpdate(sql);
            System.out.println("The question was added.");
        } catch (SQLException ex) {
            System.out.println("The question could not added.!");
        }
    }

    public Question getQuestion(int questionID) {
        try {
            String sql = "SELECT * FROM questions WHERE QuestionID = " + questionID;
            ResultSet resultset = this.database.statement.executeQuery(sql);

            return new Question(
                    questionID,
                    resultset.getString("Description"),
                    this.getOptions(resultset),
                    resultset.getString("TrueAnswer").charAt(0),
                    resultset.getString("Exam"),
                    resultset.getString("Lesson")
            );
        } catch (SQLException ex) {
            System.out.println("The question could not brought.!");
        }

        return null;
    }

    private HashMap<Character, String> getOptions(ResultSet resultset) {
        HashMap<Character, String> options = new HashMap<Character, String>();

        try {
            options.put('a', resultset.getString("OptionA"));
            options.put('b', resultset.getString("OptionB"));
            options.put('c', resultset.getString("OptionC"));
            options.put('d', resultset.getString("OptionD"));
            options.put('e', resultset.getString("OptionE"));

            return options;
        } catch (SQLException ex) {
            System.out.println("The options could not brought.!");
        }

        return null;
    }

    public void updateQuestion(Question question) {
        try {
            String sql = "UPDATE questions " + "SET Description = " + "'" + question.getDescription() + "'" + "," +
                    "OptionA = " + "'" + question.getOptionByName('a') + "'" + "," + "OptionB = " + "'" + question.getOptionByName('b') + "'" + "," +
                    "OptionC = " + "'" + question.getOptionByName('c') + "'" + "," + "OptionD = " + "'" + question.getOptionByName('d') + "'" + "," +
                    "OptionE = " + "'" + question.getOptionByName('e') + "'" + "," + "TrueAnswer = " + "'" + question.getTrueAnswer() + "'" + "," +
                    "Exam = " + "'" + question.getExam() + "'" + "," + "Lesson = " + "'" + question.getLesson() + "'" +
                    "WHERE QuestionID = " + question.getQuestionID();

            this.database.statement.executeUpdate(sql);
            System.out.println("The question was updated.");
        } catch (SQLException ex) {
            System.out.println("The question could not updated.!");
        }
    }

    public void deleteQuestion(int questionID) {
        String sql = "DELETE FROM questions WHERE QuestionID = " + questionID;

        try {
            this.database.statement.executeUpdate(sql);
            System.out.println("The question was deleted.");
        } catch (SQLException ex) {
            System.out.println("The question could not deleted.!");
        }
    }

    public LinkedList<Integer> getIdColumn() {
        LinkedList<Integer> idColumn = null;

        try {
            String sql = "SELECT QuestionID FROM questions";
            ResultSet resultset = this.database.statement.executeQuery(sql);
            idColumn = new LinkedList<Integer>();

            while(resultset.next()) {
                idColumn.add(resultset.getInt("QuestionID"));
            }
        } catch (SQLException ex) {
            System.out.println("ID column could not brought.!");
        }

        return idColumn;
    }
}
