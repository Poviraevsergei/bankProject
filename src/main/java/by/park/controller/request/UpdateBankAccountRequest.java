package by.park.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("Bank account updating model")
public class UpdateBankAccountRequest {

    @ApiModelProperty(required = true, dataType = "long", notes = "bank account id")
    private long id;

    @NotEmpty
    @NotNull
    @Size(min = 33, max = 33)
    @ApiModelProperty(dataType = "string", required = true, notes = "bank IBAN")
    private String IBAN;

    @NotEmpty
    @NotNull
    @Size(min = 33, max = 33)
    @ApiModelProperty(dataType = "long", required = true, notes = "amount money on bank acccount")
    private Long amount;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 100)
    @ApiModelProperty(required = true, dataType = "long", notes = "user id")
    private Long idUser;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 100)
    @ApiModelProperty(required = true, dataType = "long", notes = "bank id")
    private Long idBank;
}
