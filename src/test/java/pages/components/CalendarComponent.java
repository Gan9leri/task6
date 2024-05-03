package pages.components;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        int numb = Integer.parseInt(day);
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        if (numb < 10) {
            $(String.format(".react-datepicker__day--00%s", day)).click();
        }
        else {
            $(String.format(".react-datepicker__day--0%s", day)).click();
        }
    }
}
