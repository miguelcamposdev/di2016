package com.miguelcr.a08_repasorecyclerview;

import com.miguelcr.a08_repasorecyclerview.pojos.Company;
import com.miguelcr.a08_repasorecyclerview.pojos.Vuelo;

/**
 * Created by miguelcampos on 9/11/16.
 */

public interface InterfaceVueloListener {
    void onVueloClickListener(Vuelo v);
    void onEscalaClickListener(Vuelo v);
    void onCompanyClickListener(Company v);
}
