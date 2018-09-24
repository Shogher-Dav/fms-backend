package fms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;





@Entity
@Table(name="users")
public class User {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name="first_name")
	    private String firstName;

	    @Column(name="last_name")
	    private String lastName;
	

	    @Column(name="usernema")
	    private String username;

	    @Column(name="email")
	    private String email;
	    
	    @Column(name="password")
	    private String password;
	    
	    

		public Long getId() {
			return id;
		}
		
		 @ManyToMany(fetch = FetchType.EAGER)
		 @JoinTable(name = "user_role", joinColumns
		         = @JoinColumn(name = "user_id",
		         referencedColumnName = "id"),
		         inverseJoinColumns = @JoinColumn(name = "role_id",
		                 referencedColumnName = "id"))
		
		private List<Role> roles;
		 
		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		 public List<Role> getRoles() {
		        return roles;
		    }

		    public void setRoles(List<Role> roles) {
		        this.roles = roles;
		    }

		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
					+ ", email=" + email + ", password=" + password + "]";
		}
	    



}
