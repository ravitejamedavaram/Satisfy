package my.trial;

import my.trial.dao.BirthdayDao;
import my.trial.db.DBConnection;
import my.trial.security.Encoder;

public class toi {
    static DBConnection dbConnection = new DBConnection();

   static BirthdayDao birthdayDao;

    public static void main(String[] args) {
//        dbConnection.setUrl("jdbc:postgresql://ec2-174-129-225-9.compute-1.amazonaws.com:5432/d1dpvnu3ptuk2c?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory");
//        dbConnection.setUsername("xtmneuajgregei");
//        dbConnection.setPassword("af505ae9a136979e269c187f7007bd7596da778c9cb5ce0862ad9e77964a2def");
//        dbConnection.setDriver("org.postgresql.Driver");
//        birthdayDao = new BirthdayDao(dbConnection.dbConnection());
//        birthdayDao.getAllBirthdays();

        Encoder encoder = new Encoder();
        System.out.println(encoder.encode("admin"));

    }


}
