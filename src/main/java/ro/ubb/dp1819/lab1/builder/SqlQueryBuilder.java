package ro.ubb.dp1819.lab1.builder;

public class SqlQueryBuilder {
    private String str = " ";
    public SelectSqlQueryBuilder select(String selectFrom) {
        SelectSqlQueryBuilder selectBuilder = new SelectSqlQueryBuilder();
        selectBuilder.setStr(selectFrom);
        return selectBuilder;
    }
    protected void setPrevStr(String prevStr) { this.str = prevStr;}
    protected void setStr(String newStr) {this.str = this.str+ templateQuery()+newStr;}
    protected String getStr() { return this.str; }
    protected String templateQuery() {
        return " ";
    }
    public String build() {return this.str;}

    @Override
    public String toString() {
        return this.str;
    }
}
