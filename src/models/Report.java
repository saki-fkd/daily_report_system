package models;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "repoorts")
@NamedQueries({
@NamedQuery(
        name = "getAllReports",
        query = "SERECT r FROM Report AS r ORDER BY r.id DESC"
        ),
@NamedQuery(
        name = "getReportsCount",
        query = "SELECT COUNT(r) FROM Report AS r"
        ),
})
public class Report {

}
