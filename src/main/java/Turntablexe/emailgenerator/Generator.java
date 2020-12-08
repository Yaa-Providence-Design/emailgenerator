package Turntablexe.emailgenerator;

import Turntablexe.emailgenerator.model.ApplicantData;

public class Generator {
    public void generate(ApplicantData applicantData) {
        //fullname == Providence Annor Asemah

        //1. get applicant's firstname in lower case(eg. providence)
        //2. get applicant's lastname in lower case(eg. asemah)
        //3. construct ...@turntabl.io email (providence.asemah@turntabl.io)
        //4. verify if generated email doesn't exist in database
        //5. a. if email doesn't exist, insert generated email into database
        //   b. else check how many applicants' email match generated email (ie. count of occurences, eg. 2)
        //   c. add one(1) to the count(eg. 2+1) value and concatenate to the generated email (eg. providence.asemah3@turntabl.io)
    }
}

