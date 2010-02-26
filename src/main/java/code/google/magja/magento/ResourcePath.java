/**
 * based on source code from k5
 * http://www.magentocommerce.com/boards/viewthread/37982/
 *
 * @author Pawel Konczalski <mail@konczalski.de>
 *
 * You are free to use it under the terms of the GNU General Public License
 */

/*
 * Magento Core API
 * http://www.magentocommerce.com/wiki/doc/webservices-api/api
 */
package code.google.magja.magento;

public enum ResourcePath {

	CategoryTree("catalog_category.tree"),
	CategoryInfo("catalog_category.info"),
	CategoryCreate("catalog_category.create"),
	CategoryDelete("catalog_category.delete"),
	CategoryUpdate("catalog_category.update"),
	CategoryAssignProduct("catalog_category.assignProduct"),
	ProductList("catalog_product.list"),
	ProductInfo("catalog_product.info"),
	ProductCreate("catalog_product.create"),
	ProductUpdate("catalog_product.update"),
	ProductDelete("catalog_product.delete"),
	ProductTypeList("catalog_product_type.list"),
	ProductAttributeSetList("catalog_product_attribute_set.list"),
	ProductAttributeList("catalog_product_attribute.list"),
	ProductAttributeCreate("catalog_product_attribute.create"),
	ProductAttributeDelete("catalog_product_attribute.delete"),
	ProductAttributeOptions("catalog_product_attribute.options"),
	ProductAttributeAddOptions("catalog_product_attribute.addoptions"),
	ProductAttributeMediaCreate("catalog_product_attribute_media.create"),
	ProductAttributeMediaInfo("catalog_product_attribute_media.info");
	private String path;

	ResourcePath(String path) {
		this.path = path;
	}

	public String getPath() {
		return this.path;
	}
}