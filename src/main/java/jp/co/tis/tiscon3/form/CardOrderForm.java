package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;
import java.util.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank
    @Size(max = 60)
    private String kanjiName;

    @NotBlank
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaName;

    @NotBlank
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetName;

    @NotBlank
    @Size(max = 10)
    @Pattern(regexp = "\\d{4}/\\d{1,2}/\\d{1,2}$")
    private String dateOfBirth;

    @NotBlank
    @Size(max = 6)
    private String gender;

    @NotBlank
    @Size(max = 8)
    @Pattern(regexp = "^[0-9]{3}-[0-9]{4}$")
    private String zipCode;

    @NotBlank
    @Size(max = 255)
    private String address;

    @NotBlank
    @Size(max = 13)
    @Pattern(regexp = "^0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4}$")
    private String homePhoneNumber;

    @Size(max = 13)
    @Pattern(regexp = "^((070|080|090)-[0-9]{4}-[0-9]{4})?$")
    private String mobilePhoneNumber;

    @NotBlank
    @Size(max = 255)
    @Email
    private String emailAddress;

    @NotBlank
    @Size(max = 20)
    private String spouse;

    @NotBlank
    @Size(max = 20)
    private String houseClassification;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String debt;

    @NotBlank
    @Size(max = 120)
    private String job;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String income;

    @Size(max = 255)
    private String employerName;

    @Size(max = 8)
    @Pattern(regexp = "^([0-9]{3}-[0-9]{4})?$")
    private String employerZipCode;

    @Size(max = 255)
    private String employerAddress;

    @Size(max = 13)
    @Pattern(regexp = "^(0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4})?$")
    private String employerPhoneNumber;

    @Size(max = 255)
    private String industryType;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    @Size(max = 255)
    private String position;

    @Size(max = 255)
    private String department;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String employeeLength;

    private Map<String, String> userFormName = new LinkedHashMap();
    private Map<String, String> jobFormName = new LinkedHashMap();

    public CardOrderForm() {
        super();
        userFormName.put("kanjiName", "お名前（漢字）");
        userFormName.put("kanaName", "お名前（カナ）");
        userFormName.put("alphabetName", "お名前（ローマ字）");
        userFormName.put("gender", "性別");
        userFormName.put("dateOfBirth", "生年月日");
        userFormName.put("zipCode", "郵便番号");
        userFormName.put("address", "ご住所");
        userFormName.put("homePhoneNumber", "自宅電話番号");
        userFormName.put("mobilePhoneNumber", "携帯電話番号");
        userFormName.put("emailAddress", "メールアドレス");
        userFormName.put("spouse", "配偶者有無");
        userFormName.put("houseClassification", "お住まい");
        userFormName.put("debt", "ローン等のお借り入れ金額");
        userFormName.put("income", "昨年の所得");
        userFormName.put("job", "ご職業");

        jobFormName.put("employerName", "お勤め先名");
        jobFormName.put("employerZipCode", "お勤め先郵便番号");
        jobFormName.put("employerAddress", "お勤め先住所");
        jobFormName.put("employerPhoneNumber", "お勤め先電話番号");
        jobFormName.put("industryType", "業種");
        jobFormName.put("capital", "資本金");
        jobFormName.put("companySize", "お勤め先の規模（従業員数）");
        jobFormName.put("department", "所属部署");
        jobFormName.put("position", "役職");
        jobFormName.put("employeeLength", "勤続年数");

        /*
        * 複数個にまたがるフォームのエラー条件と名称は未登録！！！！！
        * 後でちゃんと確認して付け足すこと！！！！！！！！！！
        * */
    }

}
