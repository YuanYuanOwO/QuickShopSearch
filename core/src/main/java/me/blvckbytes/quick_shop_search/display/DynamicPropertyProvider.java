package me.blvckbytes.quick_shop_search.display;

import me.blvckbytes.quick_shop_search.cache.CachedShop;

public interface DynamicPropertyProvider {

  long getShopDistance(CachedShop cachedShop);

  double getPlayerBalanceForShopCurrency(CachedShop cachedShop);

}
