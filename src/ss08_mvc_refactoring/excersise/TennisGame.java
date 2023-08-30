package ss08_mvc_refactoring.excersise;

public class TennisGame {
    public static String getScore(String playerFirstName,String playerSecondName,int totalFirstName,int totalSecondName){
        String score="";
        int totalScore=0;
        if (totalFirstName==totalSecondName){
            switch (totalFirstName){
                case 1:score+="Love All";
                break;
                case 2:score+="Fifteen All";
                break;
                case 3:score+="Thirty All";
                break;
                case 4: score+="Forty All";
                break;
                default:score+="Deuce";
                break;
            }
        }else if (totalFirstName>=4||totalSecondName>=4){
            int isBothPlayer=totalFirstName-(totalSecondName);
            if (isBothPlayer==1){
                score+="The victory is in favor of player number 1";
            }
            else if (isBothPlayer==-1){
                score+="The victory is in favor of player number 2";
            }else if (isBothPlayer==2){
                score+="the winner is player number 1";
            }else {
                score+="the winner is player number 2";
            }
        }else {
            for (int i = 1; i < 3; i++) {
                if (i==1){
                    totalScore=totalFirstName;
                }
                else {
                    score+=" - ";
                    totalScore=totalSecondName;
                }
                switch (totalScore){
                    case 1:
                        score+="Love";
                        break;
                    case 2:
                        score+="Fifteen";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                    case 4:
                        score+="Thirty";
                }

            }

        }
        return score;
    }
}