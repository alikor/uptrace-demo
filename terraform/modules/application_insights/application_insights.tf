locals {
  resource_group_name      = "observability-rg"
  application_insights_name = "observability-ai"
}

resource "azurerm_log_analytics_workspace" "default" {
  name                = "observability-law"
  location            = azurerm_resource_group.default.location
  resource_group_name = local.resource_group_name
  sku                 = "PerGB2018"
  retention_in_days   = 30
}

resource "azurerm_application_insights" "default" {
  name                = local.application_insights_name
  location            = azurerm_resource_group.default.location
  resource_group_name = local.resource_group_name
  application_type    = "java"
  workspace_id        = azurerm_log_analytics_workspace.default.id
  tags = {
    environment = "dev"
  }
}

