package com.fdmgroup.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class TestLogInUser {

	LogInManager logInManager;

	@Mock
	User mockUser = mock(User.class);

	@BeforeEach
	void setUp() throws Exception {
		logInManager = new LogInManager();

	}

	@Test
	void testLogInSuccess_correctGetAndSetCalledUser() {
		// Stubbing methods to return a specific value
		when(mockUser.getUsername()).thenReturn("admin");

		// Run the real code we are testing
		assertTrue(logInManager.logIn(mockUser));

		// Verify that the correct interactions took place
		verify(mockUser).getUsername();
		// verify(mockUser, times(2)).getUsername();

		verify(mockUser).setLoggedIn(true);
		verify(mockUser).isLoggedIn();
		verify(mockUser, never()).getPassword();

	}

	@Test
	void logOutCallsUser_setLogin() {
		logInManager.logOut(mockUser);
		verify(mockUser).isLoggedIn();

	}

	@Test
	void logInWhenPasswordIsBanned() {
		when(mockUser.getPassword()).thenReturn("BANNED");
		assertEquals("BANNED", mockUser.getPassword());
	}

}













