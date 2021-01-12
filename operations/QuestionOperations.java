/**
 * @author Recep YILDIRIM
 */

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

    public boolean addQuestion(Question question) {
        try {
            String sql = "INSERT INTO questions VALUES(" +
                    question.getQuestionID() + "," +
                    "'" + question.getDescription() + "'" + "," +
                    "'" + question.getOptionByName('a') + "'" + "," +
                    "'" + question.getOptionByName('b') + "'" + "," +
                    "'" + question.getOptionByName('c') + "'" + "," +
                    "'" + question.getOptionByName('d') + "'" + "," +
                    "'" + question.getOptionByName('e') + "'" + "," +
                    "'" + question.getTrueAnswer() + "'" + ")";

            this.database.statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
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
                    resultset.getString("TrueAnswer").charAt(0)
            );
        } catch (SQLException ex) {
            return null;
        }
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
            return null;
        }
    }

    public boolean updateQuestion(Question question) {
        try {
            String sql = "UPDATE questions " + "SET Description = " + "'" + question.getDescription() + "'" + "," +
                    "OptionA = " + "'" + question.getOptionByName('a') + "'" + "," + "OptionB = " + "'" + question.getOptionByName('b') + "'" + "," +
                    "OptionC = " + "'" + question.getOptionByName('c') + "'" + "," + "OptionD = " + "'" + question.getOptionByName('d') + "'" + "," +
                    "OptionE = " + "'" + question.getOptionByName('e') + "'" + "," + "TrueAnswer = " + "'" + question.getTrueAnswer() + "'" +
                    "WHERE QuestionID = " + question.getQuestionID();

            this.database.statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean deleteQuestion(int questionID) {
        String sql = "DELETE FROM questions WHERE QuestionID = " + questionID;

        try {
            this.database.statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
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

            return idColumn;
        } catch (SQLException ex) {
            return idColumn;
        }
    }
}
