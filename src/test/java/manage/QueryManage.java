package manage;

public class QueryManage {

    private String query02= "SELECT name FROM u168183796_qaloantec.cron_schedules LIMIT 2";

    private String updateQuery01 = "UPDATE u168183796_qaloantec.users SET mobile = 191282373 WHERE username LIKE '%e_'";

    private String updateQuery02 = "UPDATE u168183796_qaloantec.users SET mobile = ? WHERE username LIKE ?";

    private String insertQuery03= "INSERT INTO u168183796_qaloantec.admin_password_resets (id,email,token,status) VALUES (?,?,?,?)";

    private String deleteQuery01 = "DELETE FROM u168183796_qaloantec.update_logs WHERE id = ?";

    private String deleteControlQuery = "SELECT * FROM u168183796_qaloantec.update_logs WHERE id = ?";





    public String getQuery02() {
        return query02;
    }

    public String getUpdateQuery01() {
        return updateQuery01;
    }

    public String getUpdateQuery02() {
        return updateQuery02;
    }

    public String getInsertQuery03() {
        return insertQuery03;
    }

    public String getDeleteQuery01() {
        return deleteQuery01;
    }

    public String getDeleteControlQuery() {
        return deleteControlQuery;
    }
}

