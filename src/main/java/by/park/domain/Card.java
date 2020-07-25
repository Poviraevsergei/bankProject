package by.park.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import java.util.Date;

@Setter
@Getter
@ToString(exclude = {
        "idBankAccount"
})
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {
        "idBankAccount"
})
@Entity
@Table(name = "m_cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_bank_account")
    private BankAccount idBankAccount;

    @Temporal(TemporalType.DATE)
    @Column(name = "expiration_date")
    private Date expirationDate;

    @Column(name = "card_type")
    private String cardType;
}