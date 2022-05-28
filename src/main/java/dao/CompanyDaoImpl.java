package dao;

import model.Company;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class CompanyDaoImpl implements CompanyDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addCompany(Company company) {
        entityManager.persist(company);
    }

    @Override
    public void updateCompany(Long id, Company company) {
Company company1 = getCompanyById(id);
company1.setNameOfCompany(company.getNameOfCompany());
company1.setLocatedCountry(company.getLocatedCountry());
entityManager.merge(company1);
    }

    @Override
@SuppressWarnings("unchecked")
    public List<Company> companyList() {
        List<Company> companyList = entityManager.createQuery("select e from Company e", Company.class).getResultList();
   return companyList;
    }

    @Override
    public Company getCompanyById(Long id) {
        return entityManager.find(Company.class, id);
    }

    @Override
    public void removeCompanyById(Long id) {
entityManager.remove(getCompanyById(id));
    }
}
