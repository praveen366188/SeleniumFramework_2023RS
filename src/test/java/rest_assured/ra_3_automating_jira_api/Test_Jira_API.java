package rest_assured.ra_3_automating_jira_api;

import io.restassured.filter.session.SessionFilter;
import org.testng.Assert;
import org.testng.annotations.Test;
import rest_assured.ra_1.CommonMethods;

public class Test_Jira_API {
    @Test
    public void test01() {
//        creating session id
        SessionFilter sessionFilter = Jira1_Cookie_Session_ID.create_session();
//        adding issue
        String response = Jira2_Add_Issue.add_issue(sessionFilter);
        String id = CommonMethods.returnJsonObjString(response, "id");
        System.out.println(id);
//        get issue
        int status_code = Jira3_Get_Issue.getIssue(sessionFilter, id);
        Assert.assertEquals(status_code, 200);
        Jira4_Add_Comment.add_comment(sessionFilter,id,"Hi");
//        delete the created issue
        Jira5_DeleteIssue.delete_issue(sessionFilter, id);



    }
}
