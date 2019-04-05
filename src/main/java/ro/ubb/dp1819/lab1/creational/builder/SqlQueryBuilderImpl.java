package ro.ubb.dp1819.lab1.creational.builder;

class SelectSqlQueryBuilder extends SqlQueryBuilder {
    public WhereSqlQueryBuilder where(String query) {
        WhereSqlQueryBuilder where = new WhereSqlQueryBuilder();
        where.setPrevStr(this.getStr());
        where.setStr(query);
        return where;
    }

    @Override
    protected String templateQuery() {
        return "SELECT FROM ";
    }
}

class WhereSqlQueryBuilder extends SqlQueryBuilder {
    public OrderBySqlQueryBuilder orderBy(String query) {
        OrderBySqlQueryBuilder orderBy = new OrderBySqlQueryBuilder();
        orderBy.setPrevStr(this.getStr());
        orderBy.setStr(query);
        return orderBy;
    }

    @Override
    protected String templateQuery() {
        return " WHERE ";
    }
}

class OrderBySqlQueryBuilder extends SqlQueryBuilder {
    public String build() { return this.toString(); }

    @Override
    protected String templateQuery() {
        return " ORDER BY ";
    }
}