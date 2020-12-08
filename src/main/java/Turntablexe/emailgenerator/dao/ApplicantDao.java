package Turntablexe.emailgenerator.dao;

import Turntablexe.emailgenerator.model.ApplicantData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ApplicantDao {
    private static final List<ApplicantData> list = new ArrayList();

    static {
        //int id, String email, String first_name, String middle_name, String last_name,
        // String nickname, String dob, String gender, String university, String year_of_graduation, String cv) {
        //
        list.add(new ApplicantData(1, "provie.asemah@turntabl.io", "provie", "annor", "asemah","nicy1", "11/04/1997", "female", "UCC", "2020", "cv0001"));
        list.add(new ApplicantData(2, "joseph.baiden@turntabl.io","joseph", "", "baiden", "nicky2", "11/04/1997", "male", "UCC", "2020", "cv0002" ));
        list.add(new ApplicantData(3, "ama.mansa@turntabl.io","ama", "", "mansa", "nicky3", "11/04/1997", "female", "UCC", "2020", "cv0003"));
        list.add(new ApplicantData(4, "benedicta.pamford@turntabl.io","benedicta", "esi", "pamford", "nicky4", "11/04/1997", "female", "UCC", "2020", "cv0004"));
        list.add(new ApplicantData(5, "baaba.asemah@turntabl.io","baaba", "yaa","asemah", "nicky5", "11/04/1997", "female", "UCC", "2020", "cv0005"));
    }


    public List<ApplicantData> fetchApplicants(){
        return list;
    }

    public void save(ApplicantData applicantData) {
        list.add(applicantData);
    }

//    public ApplicantData fetchById(int id){
//        return list.stream().forEach(applicant ->{
//            if (applicant.getId() == id)
//                return applicant;
//        });
//    }

    public List<ApplicantData> updateList(ApplicantData newData){
        
    }
}
