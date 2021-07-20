package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> listCars(int count) {

//        sessionFactory.getCurrentSession().save(new Car ("Mercedes SLC (R172)", "XTA210990Y2766389", 2016));
//        sessionFactory.getCurrentSession().save(new Car ("Mercedes SLK (R170)", "X7MXKN7FP6M004128", 1996));
//        sessionFactory.getCurrentSession().save(new Car ("Pontiac Bonneville", "X9FMMXXEEBMBM38625", 1993));
//        sessionFactory.getCurrentSession().save(new Car ("Toyota RAV-4", "JT153JSG000151888", 2006));
//        sessionFactory.getCurrentSession().save(new Car ("Toyota Blizzard", "XTA210990Y2766389", 1985));
//        sessionFactory.getCurrentSession().save(new Car ("Toyota Camry", "VF37BRFVE12345678", 2014));
//        sessionFactory.getCurrentSession().save(new Car ("Лада Калина", "JMZNK14Y26132582", 2021));
//        sessionFactory.getCurrentSession().save(new Car ("Toyota Camry", "JT4RN56S2F0139246", 1987));

        //проверка числа
        if(count<5) {
            TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery("FROM Car").setMaxResults(count);
            return query.getResultList();

        } else {
            TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery("from Car ");
            return query.getResultList();
        }
    }


//    @Override
//    public List<Car> listCars(int count) {
//
//        List<Car> carsList = new ArrayList<>();
//        carsList.add(new Car (1, "Mercedes SLC (R172)", "XTA210990Y2766389", 2016));
//        carsList.add(new Car (2, "Mercedes SLK (R170)", "X7MXKN7FP6M004128", 1996));
//        carsList.add(new Car (3, "Pontiac Bonneville", "X9FMMXXEEBMBM38625", 1993));
//        carsList.add(new Car (4, "Toyota RAV-4", "JT153JSG000151888", 2006));
//        carsList.add(new Car (5, "Toyota Blizzard", "XTA210990Y2766389", 1985));
//        carsList.add(new Car (6, "Toyota Camry", "VF37BRFVE12345678", 2014));

//        carsList.add(new Car (7, "Лада Калина", "JMZNK14Y26132582", 2021));
//        carsList.add(new Car(8, "Toyota Camry", "JT4RN56S2F0139246", 1987));
//
//        if(count<5) {
//            return carsList.subList(0, count);
//        } else {
//            return carsList;
//        }
//    }
}
