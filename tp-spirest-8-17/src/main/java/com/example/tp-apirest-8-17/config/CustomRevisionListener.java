package com.example.tp_apirest_dsw.config;

import com.example.tp_apirest_dsw.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision (Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}
