package oop.calculator;

import oop.calculator.presenter.CalcPresenter;
import oop.calculator.service.DataService;
import oop.calculator.service.Service;
import oop.calculator.view.ConsoleView;
import oop.calculator.view.View;

import java.util.Scanner;

public class App {
    static void start(){
        Scanner scanner = new Scanner(System.in);
        View view = new ConsoleView(scanner);
        Service service = new DataService();
        CalcPresenter presenter = new CalcPresenter(view, service);

        presenter.calculate();

        scanner.close();
    }
}
