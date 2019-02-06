package Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Transactions", schema = "public", catalog = "Bank")
public class TransactionsEntity {
    private Integer id;
    private Object currency;
    private Double sum;
    private Date currencyRateDay;

    @Id
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Currency", nullable = false)
    public Object getCurrency() {
        return currency;
    }

    public void setCurrency(Object currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "Sum", nullable = false, precision = 0)
    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    @Basic
    @Column(name = "CurrencyRateDay", nullable = false)
    public Date getCurrencyRateDay() {
        return currencyRateDay;
    }

    public void setCurrencyRateDay(Date currencyRateDay) {
        this.currencyRateDay = currencyRateDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransactionsEntity that = (TransactionsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (sum != null ? !sum.equals(that.sum) : that.sum != null) return false;
        if (currencyRateDay != null ? !currencyRateDay.equals(that.currencyRateDay) : that.currencyRateDay != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (sum != null ? sum.hashCode() : 0);
        result = 31 * result + (currencyRateDay != null ? currencyRateDay.hashCode() : 0);
        return result;
    }
}
