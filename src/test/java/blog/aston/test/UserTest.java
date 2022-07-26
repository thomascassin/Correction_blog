/**
 * 
 */
package blog.aston.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author manager
 *
 */

@Tag("TestUsers")
@DisplayName("Tests efectués sur les utilisateurs")
class UserTest {
	
	User userToLoggged;
	
	private static List<User> listUsers  ;

	
	@Nested
	@Tag("testAuuthentification")
	@DisplayName("Réussir à créer un compte et à se connecter")
	class Authentification {
		
		@Test
		@DisplayName("Vérifie si un user ayant un mot de passe et un email se connecte")
		void testLoginWithLoginAndPassShoulReturnUser() {
			User user = new User("didiertahobeu@gmail.com", "relax@10");
			user.setUsers(listUsers);
			User Logged = user.login();
			assertNotNull(Logged);
			
		}
		
		@Test
		@DisplayName("Verifie que l'utilisateur est ajouté dans la liste")
		void testCreerUser() {
			User user = new User();
			user.setUsers(listUsers);
			User newUser = new User( "didiertahobeu93@gmail.com", "magic90", "Didier", "Magic");
			User userAdded = user.CreerUser(newUser);
			assertEquals( user.getUsers().size(), 5);
			
		}
		
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void avatChaqueTest() throws Exception {
		listUsers = new ArrayList<User>();
		User user1 = new User( 1, "didiertahobeu@gmail.com", "relax@10", "Didier1", "TAHOBE");
		User user2 = new User(2, "ok@gmail.com", "relax@11", "O", "K");
		User user3 = new User(3, "johndoe@gmail.com", "relax@12", "John", "Doe");
		User user4 = new User(4, "janedoe@gmail.com", "relax@13", "Jane", "Doe");
		listUsers.add(user1);
		listUsers.add(user2);
		listUsers.add(user3);
		listUsers.add(user4);
	}

	

}
