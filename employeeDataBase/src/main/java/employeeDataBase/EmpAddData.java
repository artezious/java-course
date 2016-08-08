package employeeDataBase;

import java.util.Arrays;

/**
 * Created by WEO on 7/7/16.
 */
public class EmpAddData {

    String[][] dataBase;
    int commonEmplCounter;

    public EmpAddData(int numberOfEmployees) {
        dataBase = new String[numberOfEmployees][];
    }

    public void addNewEmplToDB(String[] tempArray) {
        dataBase[commonEmplCounter] = new String[tempArray.length];
        dataBase[commonEmplCounter++] = Arrays.copyOf(tempArray, tempArray.length);
    }

    public void printDataBaseEntities() {
        for (String emp[] : dataBase) {
            System.out.println(Arrays.toString(emp));
        }
    }
    public void searchDataBaseEntities(String args){
        for (int i=0; i < dataBase.length; i++) {
                if (dataBase[i][4].equals(args)) {
                    for (int j=0; j < dataBase[i].length-1; j++) {
                        System.out.print(dataBase[i][j] + " ");
                    }
                    System.out.println();
                }
        }
    }
}
