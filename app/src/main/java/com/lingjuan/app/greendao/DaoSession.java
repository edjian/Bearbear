package com.lingjuan.app.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.lingjuan.app.entity.FootprintRzy;
import com.lingjuan.app.entity.HistoryRzy;

import com.lingjuan.app.greendao.FootprintRzyDao;
import com.lingjuan.app.greendao.HistoryRzyDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig footprintRzyDaoConfig;
    private final DaoConfig historyRzyDaoConfig;

    private final FootprintRzyDao footprintRzyDao;
    private final HistoryRzyDao historyRzyDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        footprintRzyDaoConfig = daoConfigMap.get(FootprintRzyDao.class).clone();
        footprintRzyDaoConfig.initIdentityScope(type);

        historyRzyDaoConfig = daoConfigMap.get(HistoryRzyDao.class).clone();
        historyRzyDaoConfig.initIdentityScope(type);

        footprintRzyDao = new FootprintRzyDao(footprintRzyDaoConfig, this);
        historyRzyDao = new HistoryRzyDao(historyRzyDaoConfig, this);

        registerDao(FootprintRzy.class, footprintRzyDao);
        registerDao(HistoryRzy.class, historyRzyDao);
    }
    
    public void clear() {
        footprintRzyDaoConfig.clearIdentityScope();
        historyRzyDaoConfig.clearIdentityScope();
    }

    public FootprintRzyDao getFootprintRzyDao() {
        return footprintRzyDao;
    }

    public HistoryRzyDao getHistoryRzyDao() {
        return historyRzyDao;
    }

}
