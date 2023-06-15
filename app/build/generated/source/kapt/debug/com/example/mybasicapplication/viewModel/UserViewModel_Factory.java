// Generated by Dagger (https://dagger.dev).
package com.example.mybasicapplication.viewModel;

import com.example.data.dataSource.PaginationDataSourceFactory;
import com.example.domain.useCase.CreateUserFavoriteItemUseCase;
import com.example.domain.useCase.DeleteUserFavoriteItemUseCase;
import com.example.domain.useCase.GetUserProfileInfoUseCase;
import com.example.domain.useCase.GetUserRepositoriesUseCase;
import com.example.domain.useCase.ReadUserFavoriteListUseCase;
import com.example.domain.useCase.UpdateUserFavoriteItemUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserViewModel_Factory implements Factory<UserViewModel> {
  private final Provider<CreateUserFavoriteItemUseCase> createUserFavoriteItemUseCaseProvider;

  private final Provider<UpdateUserFavoriteItemUseCase> updateUserFavoriteItemUseCaseProvider;

  private final Provider<ReadUserFavoriteListUseCase> readUserFavoriteListUseCaseProvider;

  private final Provider<DeleteUserFavoriteItemUseCase> deleteUserFavoriteItemUseCaseProvider;

  private final Provider<GetUserProfileInfoUseCase> getUserProfileInfoUseCaseProvider;

  private final Provider<GetUserRepositoriesUseCase> getUserRepositoriesUseCaseProvider;

  private final Provider<PaginationDataSourceFactory> pagingReposDataSourceFactoryProvider;

  public UserViewModel_Factory(
      Provider<CreateUserFavoriteItemUseCase> createUserFavoriteItemUseCaseProvider,
      Provider<UpdateUserFavoriteItemUseCase> updateUserFavoriteItemUseCaseProvider,
      Provider<ReadUserFavoriteListUseCase> readUserFavoriteListUseCaseProvider,
      Provider<DeleteUserFavoriteItemUseCase> deleteUserFavoriteItemUseCaseProvider,
      Provider<GetUserProfileInfoUseCase> getUserProfileInfoUseCaseProvider,
      Provider<GetUserRepositoriesUseCase> getUserRepositoriesUseCaseProvider,
      Provider<PaginationDataSourceFactory> pagingReposDataSourceFactoryProvider) {
    this.createUserFavoriteItemUseCaseProvider = createUserFavoriteItemUseCaseProvider;
    this.updateUserFavoriteItemUseCaseProvider = updateUserFavoriteItemUseCaseProvider;
    this.readUserFavoriteListUseCaseProvider = readUserFavoriteListUseCaseProvider;
    this.deleteUserFavoriteItemUseCaseProvider = deleteUserFavoriteItemUseCaseProvider;
    this.getUserProfileInfoUseCaseProvider = getUserProfileInfoUseCaseProvider;
    this.getUserRepositoriesUseCaseProvider = getUserRepositoriesUseCaseProvider;
    this.pagingReposDataSourceFactoryProvider = pagingReposDataSourceFactoryProvider;
  }

  @Override
  public UserViewModel get() {
    return newInstance(createUserFavoriteItemUseCaseProvider.get(), updateUserFavoriteItemUseCaseProvider.get(), readUserFavoriteListUseCaseProvider.get(), deleteUserFavoriteItemUseCaseProvider.get(), getUserProfileInfoUseCaseProvider.get(), getUserRepositoriesUseCaseProvider.get(), pagingReposDataSourceFactoryProvider.get());
  }

  public static UserViewModel_Factory create(
      Provider<CreateUserFavoriteItemUseCase> createUserFavoriteItemUseCaseProvider,
      Provider<UpdateUserFavoriteItemUseCase> updateUserFavoriteItemUseCaseProvider,
      Provider<ReadUserFavoriteListUseCase> readUserFavoriteListUseCaseProvider,
      Provider<DeleteUserFavoriteItemUseCase> deleteUserFavoriteItemUseCaseProvider,
      Provider<GetUserProfileInfoUseCase> getUserProfileInfoUseCaseProvider,
      Provider<GetUserRepositoriesUseCase> getUserRepositoriesUseCaseProvider,
      Provider<PaginationDataSourceFactory> pagingReposDataSourceFactoryProvider) {
    return new UserViewModel_Factory(createUserFavoriteItemUseCaseProvider, updateUserFavoriteItemUseCaseProvider, readUserFavoriteListUseCaseProvider, deleteUserFavoriteItemUseCaseProvider, getUserProfileInfoUseCaseProvider, getUserRepositoriesUseCaseProvider, pagingReposDataSourceFactoryProvider);
  }

  public static UserViewModel newInstance(
      CreateUserFavoriteItemUseCase createUserFavoriteItemUseCase,
      UpdateUserFavoriteItemUseCase updateUserFavoriteItemUseCase,
      ReadUserFavoriteListUseCase readUserFavoriteListUseCase,
      DeleteUserFavoriteItemUseCase deleteUserFavoriteItemUseCase,
      GetUserProfileInfoUseCase getUserProfileInfoUseCase,
      GetUserRepositoriesUseCase getUserRepositoriesUseCase,
      PaginationDataSourceFactory pagingReposDataSourceFactory) {
    return new UserViewModel(createUserFavoriteItemUseCase, updateUserFavoriteItemUseCase, readUserFavoriteListUseCase, deleteUserFavoriteItemUseCase, getUserProfileInfoUseCase, getUserRepositoriesUseCase, pagingReposDataSourceFactory);
  }
}