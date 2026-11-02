package otherpackage;

import business.Company;
// import business.Account; // не скомпилируется — package-private
// import business.FactoryWorker; // не скомпилируется — package-private

public class NewsAgency {
    Company company;
    // FactoryWorker worker; // ошибка компиляции — именно этого хотел CEO
    // Account account; // ошибка компиляции
}