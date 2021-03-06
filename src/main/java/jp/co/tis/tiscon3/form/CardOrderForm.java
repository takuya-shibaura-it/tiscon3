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
    @Size(max = 4)
    @Pattern(regexp = "\\d{4}$")
    private String yearOfBirth;

    @NotBlank
    @Size(max = 2)
    @Pattern(regexp = "\\d{1,2}$")
    private String monthOfBirth;

    @NotBlank
    @Size(max = 2)
    @Pattern(regexp = "\\d{1,2}$")
    private String dayOfBirth;

    @NotBlank
    @Size(max = 6)
    private String gender;

    @NotBlank
    @Size(max = 3)
    @Pattern(regexp = "^[0-9]{3}$")
    private String zipCode0;

    @NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^[0-9]{4}$")
    private String zipCode1;

    @NotBlank
    @Size(max = 255)
    private String address;

    @NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^0[0-9]{1,3}$")
    private String homePhoneNumber0;

    @NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^[0-9]{2,4}$")
    private String homePhoneNumber1;

    @NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^[0-9]{4}$")
    private String homePhoneNumber2;

    @Size(max = 4)
    @Pattern(regexp = "^(070|080|090)?$")
    private String mobilePhoneNumber0;

    @Size(max = 4)
    @Pattern(regexp = "^([0-9]{4})?$")
    private String mobilePhoneNumber1;

    @Size(max = 4)
    @Pattern(regexp = "^([0-9]{4})?$")
    private String mobilePhoneNumber2;

    @NotBlank
    @Size(max = 255)
    @Email
    private String emailAddress;

    @NotBlank
    @Size(max = 20)
    private String spouse;

    //@NotBlank
    @Size(max = 20)
    private String houseClassification;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String debt;

    //@NotBlank
    @Size(max = 120)
    private String job;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String income;

    @Size(max = 255)
    private String employerName;

    @Size(max = 3)
    @Pattern(regexp = "^([0-9]{3})?$")
    private String employerZipCode0;

    @Size(max = 4)
    @Pattern(regexp = "^([0-9]{4})?$")
    private String employerZipCode1;

    @Size(max = 255)
    private String employerAddress;

    @Size(max = 4)
    @Pattern(regexp = "^(0[0-9]{1,3})?$")
    private String employerPhoneNumber0;

    @Size(max = 4)
    @Pattern(regexp = "^([0-9]{2,4})?$")
    private String employerPhoneNumber1;

    @Size(max = 4)
    @Pattern(regexp = "^([0-9]{4})?$")
    private String employerPhoneNumber2;

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
        userFormName.put("kanaName", "フリガナ");
        userFormName.put("alphabetName", "お名前（ローマ字）");
        userFormName.put("gender", "性別");
        userFormName.put("dateOfBirth", "生年月日");
        userFormName.put("zipCode", "郵便番号");
        userFormName.put("zipCode0", "郵便番号（上3桁）");
        userFormName.put("zipCode1", "郵便番号（下4桁）");
        userFormName.put("address", "ご住所");
        userFormName.put("homePhoneNumber0", "自宅電話番号（上2-4桁）");
        userFormName.put("homePhoneNumber1", "自宅電話番号（中2-4桁）");
        userFormName.put("homePhoneNumber2", "自宅電話番号（下4桁）");
        userFormName.put("mobilePhoneNumber0", "携帯電話番号（上2-4桁）");
        userFormName.put("mobilePhoneNumber1", "携帯電話番号（中2-4桁）");
        userFormName.put("mobilePhoneNumber2", "携帯電話番号（下4桁）");
        userFormName.put("emailAddress", "メールアドレス");
        userFormName.put("spouse", "配偶者有無");
        userFormName.put("houseClassification", "お住まい");
        userFormName.put("debt", "ローン等のお借り入れ金額");
        userFormName.put("income", "昨年の所得");
        userFormName.put("job", "ご職業");

        jobFormName.put("employerName", "お勤め先名");
        jobFormName.put("employerZipCode0", "お勤め先郵便番号（上3桁）");
        jobFormName.put("employerZipCode1", "お勤め先郵便番号（下4桁）");
        jobFormName.put("employerAddress", "お勤め先住所");
        jobFormName.put("employerPhoneNumber0", "お勤め先電話番号（上2-4桁）");
        jobFormName.put("employerPhoneNumber1", "お勤め先電話番号（中2-4桁）");
        jobFormName.put("employerPhoneNumber2", "お勤め先電話番号（下4桁）");
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

    public Set<String> getUserFormNameKeys() {
        return userFormName.keySet();
    }

    public Set<String> getJobFormNameKeys() {
        return jobFormName.keySet();
    }

}
