/*
    Marcin Słowiak
    rozwiązanie zadania nr. 30297 - http://pl.spoj.com/problems/AL_31_03/
*/
    


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class MyComparator implements Comparator<Data>{
    @Override
    public int compare(Data o1, Data o2) {
        int compareSurname = o1.surname.compareTo(o2.surname);
        if( compareSurname> 0){
            return compareSurname;
        }else if( compareSurname < 0){
            return compareSurname;
        }else{
            int compareName = o1.name.compareTo(o2.name);
            if(compareName>0){
                return compareName;
            }else if(compareName<0){
                return compareName;
            }else{
                int compareID = o2.idNumber.compareTo(o1.idNumber);
                if(compareID>0){
                    return compareID;
                }else{
                    return compareID;
                }
            }
        }
    }
}

class Data{
    String name;
    String surname;
    String age;
    String idNumber;

    Data(){
        name = "";
        surname = "";
        age = "";
        idNumber = "";
    }

    Data(String [] d){
        name = d[0];
        surname = d[1];
        age = d[2];
        idNumber = d[3];
    }

    void display(){
        System.out.println(name+" "+surname+" "+age+" "+idNumber);
    }
}

public class Main {

    public static String [] separateText(String t){
        String [] out = new String [2];
        out[0] = "";
        out[1] = "";
        for(int i=0; i<t.length(); ++i){
            char tmp = t.charAt(i);
            if(tmp >= '0' && tmp <='9'){
                out[0] = out[0] + t.charAt(i);
            }else{
                out[1] = out[1] + tmp;
            }
        }
        return out;
    }

    public static String [] splitToArray(String [] t){
        String [] goodOrder = new String[4];
        int dotPosition = searchDot(t[1]);
        String surname = "";
        if(t[1].substring(0, dotPosition-1) != null){
            surname = surname + t[1].substring(0, dotPosition-1);
        }
        if(t[1].substring(dotPosition+1, t[1].length()) != null){
            surname = surname + t[1].substring(dotPosition+1, t[1].length());
        }
        String name = t[1].substring(dotPosition-1, dotPosition+1);
        String age = "";
        String idNumber = "";
        int tmp = Integer.parseInt(t[0].substring(0,2));
        if(tmp >=18 && tmp<=39){
            age = "" + tmp;
            idNumber = t[0].substring(2,t[0].length());
        }else{
            age = t[0].substring(11,t[0].length());
            idNumber = t[0].substring(0, 11);
        }
        goodOrder[0] = name;
        goodOrder[1] = surname;
        goodOrder[2] = age;
        goodOrder[3] = idNumber;

        return goodOrder;
    }

    public static int searchDot(String t){
        for(int i=0; i<t.length(); ++i){
            if(t.charAt(i) == '.'){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Data> database = new ArrayList<Data>();
        String [] separatedText = new String[2];
        String [] goodOrder = new String[4];
        String text = in.readLine();
        while(text != null){
            separatedText = separateText(text);
            goodOrder = splitToArray(separatedText);
            database.add(new Data(goodOrder));
            text = in.readLine();
        }
        Collections.sort(database, new MyComparator());
        for(int i=0; i<database.size(); ++i){
            database.get(i).display();
        }
    }
}
