package com.fdmgroup.bookstore.data;

public interface Searchable {
	T findById(int id);
	List<T> findAll();
}
