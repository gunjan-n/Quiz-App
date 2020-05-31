package com.example.generalknowledgequizappproject;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int correctAnswers = 0;
    int incorrectAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void checkQuestionOneAnswers(){
        CheckBox questionOne8 = (CheckBox) findViewById(R.id.checkboxQuest1Answer_8);
        CheckBox questionOne12 = (CheckBox) findViewById(R.id.checkboxQuest1_12);
        CheckBox questionOne9 = (CheckBox) findViewById(R.id.checkboxQuest1_9);
        CheckBox questionOne18 = (CheckBox) findViewById(R.id.checkboxQuest1_18);
        boolean isQuestionOne8Checked = questionOne8.isChecked();
        boolean isQuestionOne12Checked = questionOne12.isChecked();
        boolean isQuestionOne9Checked = questionOne9.isChecked();
        boolean isQuestionOne18Checked = questionOne18.isChecked();

        if (isQuestionOne12Checked && isQuestionOne18Checked && !isQuestionOne8Checked && !isQuestionOne9Checked){
            correctAnswers++;
        }
        else incorrectAnswers++;
    }

    private void checkQuestionTwoAnswers(){
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radio_3);
        boolean isQuestionTwo3Checked = radioButton3.isChecked();
        if (isQuestionTwo3Checked){
            correctAnswers++;
        }
        else incorrectAnswers++;
    }

    private String getQuestionThreeUserInput() {
        EditText userInputLastName = (EditText) findViewById(R.id.answerInputYear);
        String year = userInputLastName.getText().toString();
        return year;
    }

    private void checkQuestionThreeAnswer(){
        String year = getQuestionThreeUserInput();
        if (year.trim().equalsIgnoreCase("1903")){
            correctAnswers++;
        }
        else incorrectAnswers++;
    }

    private void checkQuestionFourAnswers(){
        RadioButton radioButtonSahara = (RadioButton) findViewById(R.id.radio_Sahara);
        boolean isQuestionFourSaharaChecked = radioButtonSahara.isChecked();
        if (isQuestionFourSaharaChecked){
            correctAnswers++;
        }
        else incorrectAnswers++;
    }

    private void checkQuestionFiveAnswers(){
        CheckBox questionFive_Scissor = (CheckBox) findViewById(R.id.checkboxQuest5_Scissor);
        CheckBox questionFive_Pencil = (CheckBox) findViewById(R.id.checkboxQuest5_Pencil);
        CheckBox questionFive_Basketball = (CheckBox) findViewById(R.id.checkboxQuest5_Basketball);
        CheckBox questionFive_Table = (CheckBox) findViewById(R.id.checkboxQuest5_Table);
        boolean isQuestionFive_ScissorChecked = questionFive_Scissor.isChecked();
        boolean isQuestionFive_PencilChecked = questionFive_Pencil.isChecked();
        boolean isQuestionFive_BasketballChecked = questionFive_Basketball.isChecked();
        boolean isQuestionFive_TableChecked = questionFive_Table.isChecked();

        if (isQuestionFive_ScissorChecked && isQuestionFive_PencilChecked && isQuestionFive_BasketballChecked && !isQuestionFive_TableChecked){
            correctAnswers++;
        }
        else incorrectAnswers++;
    }

    private void checkQuestionSixAnswers(){
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.radio_5);
        boolean isQuestionSix5Checked = radioButton5.isChecked();
        if (isQuestionSix5Checked){
            correctAnswers++;
        }
        else incorrectAnswers++;
    }

    private void checkQuestionSevenAnswers(){
        RadioButton radioButton_carbon_dioxide = (RadioButton) findViewById(R.id.radio_carbon_dioxide);
        boolean isQuestionSeven_carbon_dioxideChecked = radioButton_carbon_dioxide.isChecked();
        if (isQuestionSeven_carbon_dioxideChecked){
            correctAnswers++;
        }
        else incorrectAnswers++;
    }

    private void checkQuestionEightAnswers(){
        RadioButton radioButton_Anaemia = (RadioButton) findViewById(R.id.radio_Anaemia);
        boolean isQuestionEight_AnaemiaChecked = radioButton_Anaemia.isChecked();
        if (isQuestionEight_AnaemiaChecked){
            correctAnswers++;
        }
        else incorrectAnswers++;
    }

    private void checkAllQuestions(){
        checkQuestionOneAnswers();
        checkQuestionTwoAnswers();
        checkQuestionThreeAnswer();
        checkQuestionFourAnswers();
        checkQuestionFiveAnswers();
        checkQuestionSixAnswers();
        checkQuestionSevenAnswers();
        checkQuestionEightAnswers();
    }

    private void resetCounterCorrectAnswers(){
        correctAnswers = 0;
        incorrectAnswers = 0;
    }

    public void submitScore(View v) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();
        checkAllQuestions();
        Toast.makeText(MainActivity.this, "Hi " + name + "!\n" + "Correct Answers: " + correctAnswers + "/8" + "\nIncorrect Answers:" + incorrectAnswers + "/8",
                Toast.LENGTH_LONG).show();
        resetCounterCorrectAnswers();
    }

}
