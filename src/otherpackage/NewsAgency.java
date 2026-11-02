package otherpackage;

import business.Company;
// import business.FactoryWorker; // не скомпилируется — package-private

public class NewsAgency {
    Company company;
    // FactoryWorker worker; // ошибка компиляции — именно этого хотел CEO
}