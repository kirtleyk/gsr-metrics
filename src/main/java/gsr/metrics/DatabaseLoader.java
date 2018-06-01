//package gsr.metrics;
//
//import gsr.metrics.Repository.UserRepository;
//import gsr.metrics.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//public class DatabaseLoader implements CommandLineRunner {
//
//private final UserRepository repository;
//
//@Autowired
//public DatabaseLoader(UserRepository repository) {
//	this.repository = repository;
//}
////
////@Override
////public void run(String... strings) throws Exception {
////		Arrays.asList({"Kevin","Kirtley","kevin@kirtley.us"}, {"Joe","Diner","charbroil"}.split(","))
////				.forEach(n -> this.repository.save(new User(n)));
////}
//
////@Override
////public void run(UserRepository userRepo) {
////	return args -> {
////		Arrays.asList("Kevin", "Joe", "Reggie", "Simone".split(","))
////				.forEach(n -> userRepo.save(new User(n.toString(), "kirtley", "kevin@kirtley.us")));
////	};
////}
//}
