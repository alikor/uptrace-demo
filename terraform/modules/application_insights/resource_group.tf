resource "azurerm_resource_group" "default" {
  name     = local.resource_group_name
  location = "westeurope"
}
