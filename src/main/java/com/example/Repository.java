/*
* File: Repository.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II-N
* Date: 2026-11-20
* Github: https://github.com/BenedekSzasz
* Licenc: MIT
*/

package com.example;

import java.util.List;

public interface Repository<T> {
    public List<T> findAll();
}
